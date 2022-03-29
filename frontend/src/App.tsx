/* Componentes para confugurar as rotas */
import { BrowserRouter, Routes, Route, Navigate } from "react-router-dom";
import { useContext, useState } from "react";

import Navbar from "components/Navbar"; /* Componente React navBar: função do JS  */
import Listing from "pages/Listing"; /* Página de listagem de filmes */
import Form from "pages/Form"; /* Página de formulário */
import Login from "components/FormLogin";
import { AuthContext, AuthProvider } from "components/Auth/";

function App() {
  /* navebar para o HTML */


  const { loading } = useContext(AuthContext)

  if (loading) {
    return <div className="loading">Carregando...</div>;
  }

  return (
    <BrowserRouter>
      {" "}
      {/* Ininciar configuração da rota para padronizar o Navbar da interface */}
      <Navbar /> {/* A parte de cima da aplicação */}
      <AuthProvider>
        <Routes>
          {" "}
          {/* Configura cada página individualmente */}
          <Route path="/login" element={<Login />} />
          <Route path="/" element={<Listing />} />
          <Route path="/form">
            <Route path=":movieId" element={<Form />} />{" "}
            {/* Configura para cada Id de cada Filme */}
          </Route>
        </Routes>
      </AuthProvider>

    </BrowserRouter>
  );
}

export default App;
/* Exportando o componente HTML - que na verdade é JSX; ponto chave da aplicaççao React */
