package io.github.jonpaino;

public enum ActivationFunction {
    
    SIGMOID{
        @Override
        public double apply(double a){
            return 1 / (1 + Math.exp(-a));
        }

        @Override
        public double derivative(double a){
            double res = apply(a);
            return res * (1 - res);
        }
    },

    RELU{
        @Override
        public double apply(double a){
            return Math.max(0, a);
        }

        @Override
        public double derivative(double a){
            return a > 0 ? 1 : 0;
        }
    },

    TANH{
        @Override
        public double apply(double a){
            double res = Math.exp(a);
            double neg_res = Math.exp(-a);
            return (res - neg_res) / (res + neg_res);
        }

        @Override
        public double derivative(double a){
            double res = apply(a);
            return 1 - (res * res);
        }
    };

    public abstract double apply(double a);
    public abstract double derivative(double a);
}
