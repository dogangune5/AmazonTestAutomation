Selenium Automation Test: Amazon Product Search and Add to Cart

This project demonstrates a test automation framework for Amazon's website, developed using Selenium WebDriver with Page Object Model (POM) design. The framework performs the following tasks:

Search for a product in the Amazon search bar.
Select a product from the search results.
Add the selected product to the cart.
Project Structure

This project follows the Page Object Model (POM) design pattern, which separates the web page elements and functionalities from the test cases, ensuring better code reusability and maintainability.

Key Components:
Pages: These classes represent the different web pages (e.g., search page, product page) and contain methods for interacting with the elements on each page.
Tests: The test scripts are written to automate the process of searching for a product and adding it to the cart using methods from the page classes.
Test Flow:
Search for a Product: The test script enters a product name in the Amazon search bar and submits the search query.
Select a Product: The test selects the first product from the search results.
Add to Cart: The selected product is added to the cart.
Technologies Used

Selenium WebDriver: For automating web browser interactions.
Java: The programming language used for writing the test scripts.
TestNG: For running and organizing the test cases.
Maven: For managing dependencies and building the project.
Page Object Model (POM): For maintaining clear separation between test scripts and web page logic.
How to Run the Tests

Clone this repository.
Install the necessary dependencies using Maven.
Set up the WebDriver for your preferred browser.
Execute the tests using TestNG.
write this to console "mvn test"

