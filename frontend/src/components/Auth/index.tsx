import React, { createContext, FC, useEffect } from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom"

type user = {
	email: string
}

function refreshPage() {
	window.location.reload();
}

export interface AuthContextInterface {
	user?: user | null
	authenticated?: boolean
	loading?: boolean
	login?: (user: string) => void
}

export const AuthContext = createContext<AuthContextInterface>({})

export const AuthProvider: FC = ({ children }) => {

	const navigate = useNavigate();

	const [user, setUser] = useState(null);
	const [loading, setLoading] = useState(true);

	useEffect(() => {
		const recoveredUser = localStorage.getItem("user")

		if (recoveredUser) {
			setUser(JSON.parse(recoveredUser))
		}

		setLoading(false);
	}, [])

	const login = (email: any) => {
		console.log("login auth", { email });

		localStorage.setItem("user", JSON.stringify(email))

		setUser(email)
		navigate("/")
		refreshPage()
	};

	return (
		<AuthContext.Provider
			value={{ authenticated: !!user, user, loading, login }}>
			{children}
		</AuthContext.Provider>
	)
}
