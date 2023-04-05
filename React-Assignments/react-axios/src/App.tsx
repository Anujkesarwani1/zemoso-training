import react, { useEffect, useState } from "react";
import "./App.css";
import API from "./axios";
import { Paper } from "@mui/material";

function App() {
  const [myData, setMyData] = useState([]);
  const [isError, setIsError] = useState("");

  const getApiData = async () => {
    try {
      const res = await API.get("/products");
      setMyData(res.data);
    } catch (error: any) {
      setIsError(error.message);
    }
  };
  useEffect(() => {
    getApiData();
  }, []);

  return (
    <div className="App">
      <h1>Products</h1>
      {isError !== "" && <h2>{isError}</h2>}

      <div className="grid">
        {myData.map((product) => {
          const { id, title, category, price, description } = product;
          return (
            <Paper elevation={4} className="card" key={id}>
              <h3>{title}</h3>
              <h5>{category}</h5>
              <h5>{price}</h5>
              <p>{description}</p>
            </Paper>
          );
        })}
      </div>
    </div>
  );
}

export default App;

