import {
  Input,
  InputGroup,
  InputLeftElement,
  Button,
  Box,
  Spinner,
} from "@chakra-ui/react";
import { SearchIcon } from "@chakra-ui/icons";
import { useState } from "react";

function SearchBar({ setWeatherData }) {
  const [serach, setSearch] = useState("");
  const [loading, setLoading] = useState(false);

  const handleSearch = async () => {
    setLoading(true);
    try {
      const response = await fetch(
        `http://localhost:8080/api/v1/weather/${serach}`
      );
      const data = await response.json();
      setWeatherData(data);
    } catch (error) {
      console.log(error);
    }
    setLoading(false);
  };
  return (
    <Box
     
      borderColor="gray.200"
      borderRadius="lg"
      mb={5}
    >
      <InputGroup>
        <InputLeftElement
          pointerEvents="none"
          children={<SearchIcon color="gray.300" />}
        />
        <Input
          type="text"
          placeholder="Search..."
          borderWidth="1px"
          borderRadius="md"
          value={serach}
          _focus={{ borderColor: "blue.400" }}
          onChange={(e) => setSearch(e.target.value)}
        />
        <Button ml={2} background={"white"} onClick={() => handleSearch()}>
          {loading ? <Spinner size={"xs"} /> : "Search"}
        </Button>
      </InputGroup>
    </Box>
  );
}

export default SearchBar;