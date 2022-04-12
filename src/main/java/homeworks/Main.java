package homeworks;

import homeworks.service.Cart;
import homeworks.service.impl.CartImpl;
import homeworks.service.impl.ProductServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConf.class);

        ProductServiceImpl productServiceImpl =
                annotationConfigApplicationContext.getBean("productServiceImpl", ProductServiceImpl.class);

        CartImpl cartImpl = annotationConfigApplicationContext.getBean("cartImpl", CartImpl.class);

        new Thread(() -> {
            userProduct(productServiceImpl, cartImpl);
        }).start();
        annotationConfigApplicationContext.close();
    }

    private static void userProduct(ProductServiceImpl productServiceImpl, CartImpl cartImpl) {

        System.out.println("Выберите продукт и добавьте его в корзину");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Актуальный список продуктов: " + "\n" + productServiceImpl.getAll());

        while (true) {

//            System.out.println("Рабочие команды: " +
//                    "\n - Добавления продукта в корзину - id продукта и Enter" +
//                    "\n - Просмотр корзины - 0 и Enter " +
//                    "\n - Удаления продукта из корзины - 1 и Enter, после чего ввести id продукта и нажать Enter" +
//                    "\n - Выход из программы - 2 и Enter");
            System.out.println("Введите id продукта и нажмите Enter для добавления продукта в корзину");

            int numProd = scanner.nextInt();
//            int chooseNum = scanner.nextInt();
            boolean b = cartImpl.addProduct(numProd);

            if (b) {
                System.out.println("Продукт в корзине!");
            }

            System.out.println("- Просмотр корзины - 0 и Enter " +
                    "\n - Удаления продукта из корзины - 1 и Enter, после чего ввести id продукта и нажать Enter" +
                    "\n - Выход из программы - 2 и Enter");

            int chooseNum = scanner.nextInt();
            if (chooseNum == 0) {
                System.out.println(cartImpl.getProducts());
            } else if (chooseNum == 1) {
                int chooseRem = scanner.nextInt();
                cartImpl.remove(chooseRem);
                System.out.println(cartImpl.getProducts());
            } else if (chooseNum == 2) {
                break;
            }
        }
    }
}
