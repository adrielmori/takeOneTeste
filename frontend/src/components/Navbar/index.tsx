import { ReactComponent as LogoTakeOne } from "assets/img/LogoTakeOne.svg";
import { ReactComponent as PerfilIcon } from "assets/img/ps.svg";
/* Import configurado seu caminho com  baseUrl:"src/ "*/
import "./styles.css";
import { Link } from "react-router-dom";

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
        <Link to="/">
          <h1>
            <LogoTakeOne />
          </h1>
          </Link>
          <Link to="/login">
            <div className="dsmovie-contact-container">
              <PerfilIcon />
              {/**/}
              {/* Esta em tag por conta de ser um componente react, com tag de HTML */}
              <p className="dsmovie-contact-link">Login</p>
            </div>
          </Link>
          {/* Refenciando o link do Git */}
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
