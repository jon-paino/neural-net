package io.github.jonpaino;
public class Main {
    public static void main(String[] args) {
        MLP mlp = new MLP(784, 16, 10, ActivationFunction.SIGMOID, ActivationFunction.SIGMOID);
        System.out.println("Hello, World!");
    }
}
