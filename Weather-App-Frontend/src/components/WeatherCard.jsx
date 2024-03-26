import { Box, Text, Flex, Icon, Image, HStack } from "@chakra-ui/react";
import { FiSun, FiCloud, FiDroplet, FiWind } from "react-icons/fi"; // Importing icons from react-icons
import {
  Accordion,
  AccordionItem,
  AccordionButton,
  AccordionPanel,
} from "@chakra-ui/react";
import moment from "moment";
function WeatherDetailsCard({ weatherData }) {
  // Sample weather data for demonstration

  return (
    <Box borderWidth="1px" borderRadius="lg" overflow="hidden" boxShadow="md" >
      <Box p="6">
        <Box d="flex" alignItems="baseline">
          <Text fontSize="2xl" fontWeight="semibold" mr="1" color={"white"}> 
            {weatherData.location.name}
          </Text>
          <Text fontSize="sm" >
            {weatherData.location.region} {weatherData.location.country}
          </Text>
        </Box>
        <HStack>
          <Text fontSize="lg" mt="2" >
            {weatherData.current.condition.text}
          </Text>
          <Image height={10} src={weatherData.current.condition.icon} />
        </HStack>

        <Flex mt="4" align="center">
          <Icon as={FiSun} boxSize="20px" color="yellow.400" />
          <Text ml="2">{weatherData.current.temp_c}</Text>
        </Flex>
        <Flex mt="2" align="center">
          <Icon as={FiDroplet} boxSize="20px" color="blue.400" />
          <Text ml="2">{weatherData.current.humidity}</Text>
        </Flex>
        <Flex mt="2" align="center">
          <Icon as={FiWind} boxSize="20px" color="green.400" />
          <Text ml="2">{weatherData.current.wind_kph}</Text>
        </Flex>
        <Accordion allowToggle mt={4}>
          <AccordionItem>
            <AccordionButton>
              <Box flex="1" textAlign="left">
                <Text fontWeight="semibold">
                  Hourly Weather for {weatherData.forecast.forecastday[0].date}
                </Text>
              </Box>
            </AccordionButton>
            <AccordionPanel pb={4}>
              <Box
                overflowX={"scroll"}
                sx={{
                  "::-webkit-scrollbar": {
                    width: "4px",
                  },
                  "::-webkit-scrollbar-thumb": {
                    bg: "#ccd4dc",
                    borderRadius: "full",
                  },
                  "::-webkit-scrollbar-track": {
                    bg: "#102b42",
                  },
                }}
              >
                <HStack
                  flex={1}
                  sx={{
                    "::-webkit-scrollbar": { display: "none" },
                    scrollbarWidth: "none",
                    msOverflowStyle: "none",
                  }}
                  p={3}
                >
                  {weatherData.forecast.forecastday[0].hour.map(
                    (hour, index) => {
                      return (
                        <HStack
                          key={index}
                          borderWidth="1px"
                          p={3}
                          gap={2}
                          borderRadius="lg"
                          mr={2}
                          minW={"300"}
                        >
                          <Text>Time {moment(hour.time).format("HH:mm")}</Text>
                          <Image h={10} src={hour.condition.icon} />
                          <Text ml="2"> {hour.temp_c} °C</Text>
                          <Text ml="2">{hour.condition.text}</Text>
                        </HStack>
                      );
                    }
                  )}
                </HStack>
              </Box>
            </AccordionPanel>
          </AccordionItem>
        </Accordion>
        {/* <Box mt="4">
          <Text fontWeight="semibold">
            Hourly Weather for {weatherData.daily.day}:
          </Text>
          {weatherData.daily.hourly.map((hour, index) => (
            <Flex key={index} mt="2" align="center">
              <Text>{hour.time}</Text>
              <Flex ml="2" align="center">
                <Icon as={FiSun} boxSize="16px" color="yellow.400" />
                <Text ml="2">{hour.temperature}</Text>
              </Flex>
              <Text ml="2">{hour.weatherDescription}</Text>
            </Flex>
          ))}
        </Box> */}
      </Box>
    </Box>
  );
}

export default WeatherDetailsCard;
