
import { Link } from "react-router-dom";

const Navbar = () => {
    return (
        <div>
                <nav className="navbar navbar-expand-lg bg-body-tertiary">
                    <div className="container-fluid">
                        <Link className="navbar-brand" to="/">Hendrix</Link>
                        <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarNav">
                            <ul className="navbar-nav">
                                <li className="nav-item">
                                    <Link className="nav-link active" aria-current="page" to="/">Home</Link>
                                </li>
                                <li className="nav-item">
                                    <Link className="nav-link" to="/DondeEstamos">Donde Estamos</Link>
                                </li>
                                <li className="nav-item">
                                    <Link className="nav-link" to="/products">Productos</Link>
                                </li>
                                <li className="nav-item">
                                    <Link className="nav-link" to="/grilla">Grilla</Link>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
        </div>
    )
}

export default Navbar;
