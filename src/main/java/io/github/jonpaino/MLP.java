package io.github.jonpaino;
public class MLP {
    private int input_nodes;
    private int hidden_nodes;
    private int output_nodes;

    private ActivationFunction hiddenAF;
    private ActivationFunction outputAF;

    public MLP(int input_nodes, int hidden_nodes, int output_nodes, ActivationFunction hiddenAF, ActivationFunction outputAF){
        this.input_nodes = input_nodes;
        this.hidden_nodes = hidden_nodes;
        this.output_nodes = output_nodes;

        this.hiddenAF = hiddenAF;
        this.outputAF = outputAF;
    }


}
