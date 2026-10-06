import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { addTodo } from "./todoSlice";

const TodoList = () => {
  const todos = useSelector((state) => state.todos.items);
  const dispatch = useDispatch();
  return (
    <div>
      <h1>Todo list</h1>

      <button onClick={() => dispatch(addTodo("Learn Typescript"))}>
        Add todo
      </button>

      {todos.map((ele) => {
        return (
          <div key={ele.id}>
            <h5>{ele.text}</h5>
          </div>
        );
      })}
    </div>
  );
};

export default TodoList;
