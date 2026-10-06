import { createSlice } from "@reduxjs/toolkit";
import { useReducer } from "react";



export const counterSlice = createSlice({
    name:"counter",
    initialState : 0,
    reducers :{
        increment : (state) =>{
            // state.value +=1;
            return state + 1;
        }
    }
})


export const {increment} = counterSlice.actions;


export default counterSlice.reducer;
