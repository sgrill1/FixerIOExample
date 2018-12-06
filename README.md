# FixerIOExample

## Aim

This project is an extension to the JSONRatesParsing project. The aim is to read the exhange rate information directly from an API. The benfit is that it returns the most recent exchange rates rather than static data from a file.

## How it works

### KeyReader

* The Key Reader class instantiates a Properties object reads a property list using the .load()
* The FileReader class accepts the path to the .properties file
* The properties are read as key-value pairs using the .getProperty() method to retrieve the API Key
* NOTE: The user will need to create a .properties file in a resources folder and request an API key from https://fixer.io/

### FixerHTTPManager

* The FixerHTTPManger will use the key reader Class to get the api key and concatinate it with the appropriate part of the URL.
* The setLatestRates Method uses a CloseableHttpClient to create a connection to the client
* The HttpGet accepts a URI and creates a get request to the URI for the latest rates
* Then the EntityUtils.toString object returns the response as a String

### JSONFactory
* This JSON Factory accepts the response as a string and casts it to a JSON OBject
