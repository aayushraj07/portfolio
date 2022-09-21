import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import {useEffect, useState} from "react";
import 'bootstrap/dist/css/bootstrap.min.css'
// import logo from '../assets/img/' 

export const NavBar = () => {
    const [activeLink,setActiveLink] = useState('home');
    const [scrolled, seScrolled] = useState(false);

    const state = useState();

    const [count, setCount] =useState(0);

    const IncNum = () => {
        console.log(state);
    }

    useEffect(()=>{
        const onScroll = () => {
            if(window.scrollY > 50){
                seScrolled(true);
            }else{
                seScrolled(false);
            }
        }
        window.addEventListener("scroll",onScroll);
        return () => window.removeEventListener("scroll", onScroll);
    }, [])

    const onUpdateActiveLink = (value) =>{
        setActiveLink(value);
    }


    return(
        <Navbar expand="lg" className={scrolled? "scrolled":""}>
            <div>
            <h1>{count}</h1>
            <button onClick={IncNum}>Click Me</button>
            </div>
      <Container>
        <Navbar.Brand href="#home">
            <img src={''} alt="Logo"/>
        </Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" >
            <span className='navbar-toggle-icon'></span>
        </Navbar.Toggle >
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href="#home" className={activeLink === 'home' ? 'active navbar-link' : 'navbar-link'}
             onClick={()=>{
                onUpdateActiveLink('home')
             }}>Home</Nav.Link>
            <Nav.Link href="#skills" className={activeLink === 'skills' ? 'active navbar-link' : 'navbar-link'} onClick={()=>{
                onUpdateActiveLink('skills')
             }}>Skills</Nav.Link>
            <Nav.Link href="#project" className={activeLink === 'projects' ? 'active navbar-link' : 'navbar-link'} onClick={()=>{
                onUpdateActiveLink('projects')
             }}>Project</Nav.Link>
          </Nav>
          <span className="navabar-text">
            <div className='social-icon'>
                <a href='#'><img src={''} alt=""/></a>
                <a href='#'><img src={''} alt=""/></a>
                <a href='#'><img src={''} alt=""/></a>

            </div>
            <button className='vvd' onClick={() =>console.log('connect')}>
                <span>Lets Connect</span>
            </button>
           </span>
        </Navbar.Collapse>
      </Container>
    </Navbar>
    )
}

export default NavBar