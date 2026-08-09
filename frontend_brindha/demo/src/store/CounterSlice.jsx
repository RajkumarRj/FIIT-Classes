import React from "react";
import { createSlice } from "@reduxjs/toolkit";

export const CounterSlice = createSlice({
  name: "Counter",
  initialState: { value: 10 },
  reducers: {
    increment: (state) => {
      state.value += 1;
    },
    decrement: (state) => {
      state.value -= 1;
    },
    reset: (state) => {
      state.value = 0;
    },
  },
});

export const { increment, decrement, reset } = CounterSlice.actions;
export default CounterSlice.reducer;
