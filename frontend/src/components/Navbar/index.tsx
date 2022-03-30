import { ReactComponent as LogoTakeOne } from "assets/img/LogoTakeOne.svg";
import { ReactComponent as PerfilIcon } from "assets/img/ps.svg";
import {ReactComponent as Logout} from "assets/img/logout.svg";
import "./styles.css";
import { Link } from "react-router-dom";

function refreshPage() {
  window.location.reload();
}

function logout() {

  var user = "Login";
  if (localStorage.getItem('user') != null) {
    var tam = localStorage.getItem("user")!.length;
    user = localStorage.getItem("user")!.slice(1, tam - 1);
  }

  const handleLogout = () => {
    if (localStorage.getItem('user') != null) {
      localStorage.removeItem("user")
      refreshPage()
    }
  }


  if (localStorage.getItem("user") != null) {

    return (

      <div className="dsmovie-contact-container">

        <div className="dsmovie-contact-container">
          <PerfilIcon />
          <p className="dsmovie-contact-link">{user}</p>
        </div>

        {localStorage.getItem("user") != null &&
        <div className="desmoviecontact-logout">
          <button onClick={handleLogout} className="dsmovie-btn-logout">
            <Logout className="desmoviecontact-logout-image"/>
            Sair
          </button>
        </div>
       
        }

      </div>

    )
  } else {
    return (
      <Link to="/login">
        <div className="dsmovie-contact-container">
          <PerfilIcon />
          <p className="dsmovie-contact-link">{user}</p>
        </div>
      </Link>
    )
  }

}

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
          <div>{logout()}</div>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
