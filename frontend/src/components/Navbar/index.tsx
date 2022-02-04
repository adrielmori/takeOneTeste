import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import { ReactComponent as PerfilIcon } from "assets/img/ps.svg";
/* Import configurado seu caminho com  baseUrl:"src/ "*/
import "./styles.css";

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <h1>TakeOne</h1>
          <a href="https://github.com/adrielmori" target="_new">
            <div className="dsmovie-contact-container">
               <PerfilIcon/>{/**/}
              {/* Esta em tag por conta de ser um componente react, com tag de HTML */}
              <p className="dsmovie-contact-link">Login</p>
            </div>
          </a>
          {/* Refenciando o link do Git */}
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
