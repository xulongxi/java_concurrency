package lesson1;

/**
 * 描述：     实现Runnable接口实现线程
 */
public class RunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("用实现Runnable接口实现线程");
    }

}
