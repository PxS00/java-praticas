package br.com.fiap.bean;

import java.time.LocalDate;

public class ContaPoupanca extends ContaBancaria {
        private int diaDeRendimento;

        public ContaPoupanca() {
        }

        public int getDiaDeRendimento() {
            return diaDeRendimento;
        }

        public void setDiaDeRendimento(int diaDeRendimento) {
            this.diaDeRendimento = diaDeRendimento;
        }

        public float aplicarRendimento(float taxa) {
            float rendimento = super.getSaldo() * (taxa / 100);
            super.setSaldo(super.getSaldo() + rendimento);
            return super.getSaldo();
        }
    }


