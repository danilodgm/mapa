class Banco(val nome: String){
    var contas = arrayListOf<ContaCorrente>()

    fun atende (conta: ContaCorrente){
        contas.add(conta)
    }

    fun saldoTotal(): Double{
        var total = 0.0
        for (conta in contas){
            total += conta.saldo
        }
        return total
    }
}