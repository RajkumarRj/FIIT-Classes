import { createSlice } from "@reduxjs/toolkit";


const initialState = {
    items : [
        {id:1, text:"Learn react redux"},
        {id:2, text:"Set up multiple slice"}
    ]
}


export const todoSlice = createSlice({
  name: "todos",
  initialState,
  reducers:{
    addTodo:(state,action)=>{
        const newTodo = {
            id:Date.now(),
            text :action.payload
        }

        state.items.push(newTodo);
    }
  }
});


export const {addTodo} = todoSlice.actions;


export default todoSlice.reducer;