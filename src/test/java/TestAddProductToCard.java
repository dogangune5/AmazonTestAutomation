import Base.BaseTest;
import Pages.CardPage;
import Pages.HomePage;
import Pages.ProductDetailPage;
import Pages.ProductsPage;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TestAddProductToCard extends BaseTest {


    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CardPage cardPage;

    @Test
    public void search_a_product() {

        homePage = new HomePage(driver);
        homePage.acceptCookies();
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Laptop");
        Assertions.assertTrue(productsPage.isOnProductPage(),"Not on product page"); // sayfadamıyız diye kontrol ediyoruz


    }

    @Test
    public void select_a_product() {

        search_a_product();

        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectedProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page");


    }

    @Test
    public void add_a_product_to_card() {

        select_a_product();
        productDetailPage.addToCard();
        Assertions.assertTrue(homePage.isProductCountUp(),"Product count did not increase");

    }


    @Test
    public void go_to_card() {

        add_a_product_to_card();

        cardPage = new CardPage(driver);
        homePage.goToCard();
        Assertions.assertTrue(cardPage.checkIfProductAdded(),"Product was not added to card");

    }






}