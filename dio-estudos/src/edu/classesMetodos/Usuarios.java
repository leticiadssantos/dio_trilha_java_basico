package edu.classesMetodos;

public class Usuarios {
    public static void main(String[] args) throws Exception {
        // CRIANDO UM OBJETO CONTROLE REMOTO CHAMADO MINHATV.
        SmartTv minhaTv = new SmartTv();

        // USUÁRIO DIMINUINDO O VOLUME
        minhaTv.diminuirVolume();
        minhaTv.diminuirVolume();
        minhaTv.diminuirVolume();
        minhaTv.aumentarVolume();

        System.out.println("====== STATUS ATUAL DA TV ======");
        System.out.println("Canal Atual " + minhaTv.canal);
        System.out.println("Volume atual " + minhaTv.volume);
        System.out.println("Esta ligada? " + minhaTv.ligada);

        minhaTv.mudarCanal(150);
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();

        System.out.println("====== STATUS ATUAL DA TV ======");
        System.out.println("Canal Atual " + minhaTv.canal);
        System.out.println("Volume atual " + minhaTv.volume);
        System.out.println("Esta ligada? " + minhaTv.ligada);

    }

}
