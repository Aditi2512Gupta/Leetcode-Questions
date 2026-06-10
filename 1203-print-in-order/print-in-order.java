class Foo {

    private volatile boolean firstDone = false;
    private volatile boolean secondDone = false;

    public Foo() {
    }

    public void first(Runnable printFirst) {
        printFirst.run();
        firstDone = true;
    }

    public void second(Runnable printSecond) {
        while (!firstDone) {
        }

        printSecond.run();
        secondDone = true;
    }

    public void third(Runnable printThird) {
        while (!secondDone) {
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