import { useEffect, useState } from "react";
import { Container, Box,Text } from "@chakra-ui/react";
import SearchBar from "./components/Search";
import WeatherDetailsCard from "./components/WeatherCard";
import './App.css'

function App() {
  const [weatherData, setWeatherData] = useState(null);

  return (
    <Container maxW="container.lg" mt={8} >
      <Box  borderColor="gray.200" borderRadius="lg" mb={5}>
        <Text color={'white'} fontSize={36} fontWeight={'semibold'}>Weather  Forecast</Text>
      </Box>
      <SearchBar setWeatherData={setWeatherData} />
      <Box  borderColor="gray.200" borderRadius="lg" mb={5}>
        {weatherData ? <WeatherDetailsCard weatherData={weatherData} /> : null}
      </Box>
    </Container>
  );
}

export default App;
