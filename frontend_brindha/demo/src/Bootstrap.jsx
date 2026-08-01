import React from "react";
import { Form } from "react-bootstrap";

const Bootstrap = () => {
  return (
    <div>
      <h1 className="text-green-800">Bootstrap</h1>

      <Form>
        <Form.Group className="mb-3" controlId="formBasicEmail">
          <Form.Label>Email address</Form.Label>
          <Form.Control type="email" placeholder="Enter email" />
          <Form.Text className="text-green-800">
            We'll never share your email with anyone else.
          </Form.Text>
        </Form.Group>

        <Form.Group></Form.Group>
      </Form>
    </div>
  );
};

export default Bootstrap;
