class Foo {

    private volatile int order = 1;

    public Foo() {
    }

    public void first(Runnable printFirst) {
        printFirst.run();
        order = 2;
    }

    public void second(Runnable printSecond) {
        while (order != 2) {
            Thread.yield();
        }

        printSecond.run();
        order = 3;
    }

    public void third(Runnable printThird) {
        while (order != 3) {
            Thread.yield();
        }

        printThird.run();
    }
}

// class Foo {

//     public Foo() {
        
//     }

//     public void first(Runnable printFirst) throws InterruptedException {
        
//         // printFirst.run() outputs "first". Do not change or remove this line.
//         printFirst.run();
//     }

//     public void second(Runnable printSecond) throws InterruptedException {
        
//         // printSecond.run() outputs "second". Do not change or remove this line.
//         printSecond.run();
//     }

//     public void third(Runnable printThird) throws InterruptedException {
        
//         // printThird.run() outputs "third". Do not change or remove this line.
//         printThird.run();
//     }
// }