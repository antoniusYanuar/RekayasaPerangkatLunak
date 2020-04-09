import React from "react";
import { Navbar, Nav } from "react-bootstrap";

class NavBarComponent extends React.Component {
  render() {
    return (
      <Navbar bg="dark" variant="dark">
        <Navbar.Brand href="#home">Dashboard</Navbar.Brand>
        <Nav className="mr-auto">
          <Nav.Link href="#home">View</Nav.Link>
          <Nav.Link href="#features">Add</Nav.Link>
          <Nav.Link href="#pricing">Other</Nav.Link>
        </Nav>
      </Navbar>
    );
  }
}

export default NavBarComponent;
