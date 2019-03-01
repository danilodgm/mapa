class ContaCorrente(val cliente: String, var saldo: Double){

    fun deposita(valor: Double){
        saldo += valor
    }

    fun saca(valor: Double){
        saldo -= valor
    }


}