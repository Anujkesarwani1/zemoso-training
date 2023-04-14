import React from "react";
import "./App.css";
import { useDispatch, useSelector } from "react-redux";
import { bindActionCreators } from "redux";
import { actionCreators } from "./state/index";
import { State } from "./state/reducers";
import { ButtonGroup, Button } from '@mui/material'

function App() {
  const dispatch = useDispatch();

  const { depositMoney, withdrawMoney, bankrupt } = bindActionCreators(
    actionCreators,
    dispatch
  );
  const state = useSelector((state: State) => state.bank);

  return (
    <div className="App">
      <h1>{state}</h1>
      <ButtonGroup variant="outlined" aria-label="outlined button group">
        <Button size='large' onClick={() => depositMoney(1000)}>Deposit</Button>
        <Button size='large' onClick={() => withdrawMoney(1000)}>Withdraw</Button>
        <Button size='large' onClick={() => bankrupt()}>Bankrupt</Button>
      </ButtonGroup>
    </div>
  );
}

export default App;
