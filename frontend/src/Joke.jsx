import React, { useEffect, useState } from "react";
import axios from "axios";

const Joke = () => {
  const [joke, setJoke] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  const fetchJoke = () => {
    setLoading(true);
    setError(null);
    axios
      .get("https://v2.jokeapi.dev/joke/Programming")
      .then((response) => {
        setJoke(response.data);
        setLoading(false);
      })
      .catch(() => {
        setError("Failed to fetch joke");
        setLoading(false);
      });
  };

  useEffect(() => {
    fetchJoke(); // fetch first joke on mount
  }, []);

  if (loading) return <p>Loading joke...</p>;
  if (error) return <p>{error}</p>;

  return (
    <div style={styles.card}>
      <h2 style={styles.category}>Programming Joke</h2>
      <p style={styles.setup}>{joke.setup}</p>
      <p style={styles.delivery}>{joke.delivery}</p>
      <button style={styles.button} onClick={fetchJoke}>
        Next Joke
      </button>
    </div>
  );
};

const styles = {
  card: {
    border: "1px solid #ccc",
    borderRadius: "8px",
    padding: "16px",
    maxWidth: "500px",
    margin: "20px auto",
    backgroundColor: "#f9f9f9",
    fontFamily: "Arial, sans-serif",
    textAlign: "center",
  },
  category: {
    fontSize: "20px",
    fontWeight: "bold",
    marginBottom: "12px",
  },
  setup: {
    fontSize: "18px",
    fontWeight: "bold",
    marginBottom: "8px",
  },
  delivery: {
    fontSize: "16px",
    color: "#333",
    marginBottom: "12px",
  },
  button: {
    padding: "10px 20px",
    fontSize: "16px",
    borderRadius: "6px",
    border: "none",
    backgroundColor: "#007BFF",
    color: "#fff",
    cursor: "pointer",
  },
};

export default Joke;
