//Classe
public class Conta {
double saldo;
int agencia;
int conta;
String titular;
// Função 1, sem retorno mas com parametro
void depositar (double valor) {
	//Calculo
	saldo = saldo + valor;
}
//Função 2, tem retorno mas não tem parametro
double extrato() {
	return saldo;
}
//Função 3, tem retorno e tem parametro
String sacar(double valor) {
	if(saldo>=valor) {
		saldo = saldo - valor;
		return "Valor sacado com sucesso!";
	}
	return "Valor insuficiente para sacar";
}
}
