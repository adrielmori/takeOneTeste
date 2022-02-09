import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import { ErrorMessage, Formik, Form, Field } from 'formik';
import { ReactComponent as Logo } from "assets/img/LogoLogin.svg";
import "./styles.css";
import axios from "axios";


function Login() {

  return (
    <div className="dsmovie-form-container">
      <div className="dsmovie-login-bottom-container">
        <Logo />
        <form className="dsmovie-form">
          {" "}
          {/* Comandos do usuário */}
          
          <div className="form-group dsmovie-form-group">
            <label htmlFor="email">Email</label>
            <input type="email" className="form-control" id="email" />
          </div>
          <div className="dsmovie-form-btn-container">
            <button type="submit" className="btn btn-primary dsmovie-btn">
              Register
            </button>
            <div></div>{/*Para se precisar implementar senha e nome de usuário*/}
          </div>
        </form>
        <Link to="/">
          {" "}
          {/* Volta para a página inicial da Listagem */}
          <button className="btn btn-primary dsmovie-btn-cancel mt-3">Cancel</button>
        </Link>
      </div>
    </div>
  );
}

export default Login;
