import React, {createContext, FC, useEffect} from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom"

type user = {
		email: string
}

export interface AuthContextInterface {
	user?: user | null
	authenticated?: boolean
	loading?: boolean
	login?: (user: string) => void
	logout?: () => void
}

export const AuthContext = createContext<AuthContextInterface>({})

export const AuthProvider: FC = ({children}) => {

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
	
	const login = (email:any) => {
		console.log("login auth", {email});

		const loggedUser = {
			email,
		}

		localStorage.setItem("user", JSON.stringify(loggedUser))

		setUser(email)
		navigate("/")
	};

	const logout = () => {
		setUser(null);
		localStorage.removeItem("user")
		navigate("/login")
	};
 
	return (
		<AuthContext.Provider 
			value={{authenticated: !!user, user, loading, login, logout}}>
			{children}
		</AuthContext.Provider>
	)
}
