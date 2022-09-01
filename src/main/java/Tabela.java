public class Tabela {
    private int ano;
    private int peso;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int obterClasse() {
        if (this.ano <= 1970) {
            if (peso < 1200) {
                return 1;
            }
            else {
                if (peso <= 1700) {
                    return 2;
                }
                else {
                    return 3;
                }
            }
        }

        else {
            if (this.ano <= 1979) {
                if (peso < 1200) {
                    return 4;
                }
                else {
                    if (peso <= 1700) {
                        return 5;
                    }
                    else {
                        return 6;
                    }
                }
            }
            else {
                if (peso < 1600) {
                    return 7;
                }
                else {
                    return 8;
                }
            }
        }
    }

    public float obterTaxa() {
        if (this.ano <= 1970) {
            if (peso < 1200) {
                return 16.50f;
            }
            else {
                if (peso <= 1700) {
                    return 25.50f;
                }
                else {
                    return 46.50f;
                }
            }
        }

        else {
            if (this.ano <= 1979) {
                if (peso < 1200) {
                    return 27.00f;
                }
                else {
                    if (peso <= 1700) {
                        return 30.50f;
                    }
                    else {
                        return 52.50f;
                    }
                }
            }
            else {
                if (peso < 1600) {
                    return 19.50f;
                }
                else {
                    return 55.50f;
                }
            }
        }
    }

}

