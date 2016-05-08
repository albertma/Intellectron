/***********************************************************
* Developer: Minhas Kamal (minhaskamal024@gmail.com)       *
* Website: https://github.com/MinhasKamal/Intellectron     *
* License:  GNU General Public License version-3           *
***********************************************************/

package test;

import com.minhaskamal.neuralnetwork.NeuronLayer;

public class NeuralLayerTest {
	public static void main(String[] args) {
		NeuronLayer neuronLayer = new NeuronLayer(3, 4);
		
		double[] inputs = new double[]{0.3, 0.2, 0.99, 1};
		neuronLayer.process(inputs);
		
		double[] outputs = neuronLayer.getOutputs();
		for(int i=0; i<outputs.length; i++){
			System.out.println(outputs[i]);
		}
		
		System.out.println(neuronLayer.toString());
	}
}
