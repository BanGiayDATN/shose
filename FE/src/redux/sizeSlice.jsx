import { createSlice } from "@reduxjs/toolkit";

// var size = [{name:"36", status:1}, {name:"37", status:0}]
export const sizeSlice = createSlice({
    name: "sizes",
    initialState: {
        sizes: {
        value: [] 
      }
    },
    reducers: {
      addSize: (state, action) => {
        console.log("AddSize Action");
        state.sizes.value.unshift(action.payload);
      },
      addAllPost: (state, action) => {
        state.sizes.value = [...action.payload];
      },
    },
  });
  
  // Action creators are generated for each case reducer function
  export const {
    addSize,
    addAllPost
  } = sizeSlice.actions;
  
  export default sizeSlice.reducer;