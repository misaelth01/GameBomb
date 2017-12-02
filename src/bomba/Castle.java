package bomba;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Castle extends javax.swing.JFrame implements Runnable {

    Thread h1, t; 
    int i = 60; 
    static String team, respuesta,scoreS;
    static int cont = 0, score=0;
    

    public Castle() {
        initComponents();
        h1 = new Thread(this);
        setLocationRelativeTo(null);
        jtf_pregunta.setLineWrap(true);
    }

    public void run() {

        Thread ct = Thread.currentThread();
        while (ct == h1) {
            i = i - 1;
            
            
            if(i<=9){
                time.setText("0:0" + i);
            }else{
            time.setText("0:" + i);
            }
            
            // para color de cuadro
            if (i == 59) {
                time.setBackground(Color.green);
            }
            if (i == 20) {
                time.setBackground(Color.orange);
            }
            if (i == 10) {
                time.setBackground(Color.red);
            }

            if (i == 0) {
                time.setText("0:00");
                if(score<5){
                    JOptionPane.showMessageDialog(null,"Terrible. ¡Mejor suerte a la proxima!");
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bOMBA/grey_bomb (1).png")));
                    Explosion.main(null);
                    h1.suspend();
                }if(score>=5 && score<=8){
                    JOptionPane.showMessageDialog(null,"Ni bien, ni mal. ¡Puedes mejorar!");
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bOMBA/grey_bomb (1).png")));
                    Explosion.main(null);
                    h1.suspend();
                }if(score>8){
                    JOptionPane.showMessageDialog(null,"Excelente. ¡Sé el mejor siempre!");
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bOMBA/grey_bomb (1).png")));
                    Explosion.main(null);
                    h1.suspend();
                }                
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    
    
    public static void selecc(String tema){
        switch(tema){
            case "matematicas":
                JOptionPane.showMessageDialog(null,"Haz seleccionado Matemáticas");
                team = "matematicas";
                break;
            case "ingles":
                JOptionPane.showMessageDialog(null,"Haz seleccionado Ingles");
                team = "ingles";
                break;
            case "historia": 
                JOptionPane.showMessageDialog(null,"Haz seleccionado Historia");
                team = "historia";
                break;
            case "español":
                JOptionPane.showMessageDialog(null,"Haz seleccionado Español");
                team = "español";
                break;
            case "ciencias":
                JOptionPane.showMessageDialog(null,"Haz seleccionado Ciencias");
                team = "ciencias";
                break;
            case "geografia":
                JOptionPane.showMessageDialog(null,"Haz seleccionado Geografía");
                team = "geografia";
                break;
        }
    }
    static void mat(){
            cont++;
            switch(cont){
                case 1:
                    jtf_pregunta.setText("Qué teorema nos dice: 'Él cuadrado de la hipotenusa es igual a la suma de los cuadrados de los catetos'?");
                    respuesta = "teorema de pitagoras";
                    break;
                case 2:
                    jtf_pregunta.setText("Cuál es el mayor número que se puede escribir con tres 9?");
                    respuesta = "999";
                    break;
                case 3: 
                    jtf_pregunta.setText("En un cuarto, en cada esquina hay un gato y cada gato ve tres gatos, ¿cuántos gatos hay en total?");
                    respuesta = "4";
                    break;
                case 4:
                    jtf_pregunta.setText("¿Cómo puedes hacer el número 100 con cuatro 9?");
                    respuesta = "99+9/9";
                    break;
                case 5:
                    jtf_pregunta.setText("¿2+3+3x11?");
                    respuesta = "38";
                    break;
                case 6:
                    jtf_pregunta.setText("Escribe 13 con cuatro 1");
                    respuesta = "11+1+1";
                    break;
                case 7:
                    jtf_pregunta.setText("Si vas en una moto a 80km/h. ¿Cuánto tardas para llegar a los 80km?");
                    respuesta = "1 hora";
                    break;
                case 8:
                    jtf_pregunta.setText("¿Cuál es la raiz cúbica de 8?");
                    respuesta = "2";
                    break;
                case 9:
                    jtf_pregunta.setText("Cuando yo tenía 6 años, mi hermana menor tenía la mitad que yo. Ahora que yo tengo 70 años. ¿Cuántos años tiene mi hermana?");
                    respuesta = "67";
                    break;
                case 10:
                    jtf_pregunta.setText("¿Qué figura geométrica tiene 4 angulos de 90 grados?");
                    respuesta = "cuadrado";
                    break;
            }
    }
    static void ing(){
        cont++;
            switch(cont){
                case 1:
                    jtf_pregunta.setText("Ing Pregunta");
                    respuesta = "respuesta 1";
                    break;
                case 2:
                    jtf_pregunta.setText("Ing Pregunta 2?");
                    respuesta = "respuesta 2";
                    break;
                case 3: 
                    jtf_pregunta.setText("Ing Pregunta 3?");
                    respuesta = "respuesta 3";
                    break;
                case 4:
                    jtf_pregunta.setText("Ing Pregunta 4?");
                    respuesta = "respuesta 4";
                    break;
                case 5:
                    jtf_pregunta.setText("Ing Pregunta 5?");
                    respuesta = "respuesta 5";
                    break;
                case 6:
                    jtf_pregunta.setText("Ing Pregunta 6?");
                    respuesta = "respuesta 6";
                    break;
                case 7:
                    jtf_pregunta.setText("Ing Pregunta 7?");
                    respuesta = "respuesta 7";
                    break;
                case 8:
                    jtf_pregunta.setText("Ing Pregunta 8?");
                    respuesta = "respuesta 8";
                    break;
                case 9:
                    jtf_pregunta.setText("Ing Pregunta 9?");
                    respuesta = "respuesta 9";
                    break;
                case 10:
                    jtf_pregunta.setText("Ing Pregunta 10?");
                    respuesta = "respuesta 10";
                    break;
            }
    }
    static void hist(){
        cont++;
            switch(cont){
                case 1:
                    jtf_pregunta.setText("¿Quién dio el grito de independencia?");
                    respuesta = "miguel hidalgo";
                    break;
                case 2:
                    jtf_pregunta.setText("¿Quién dijo la frase: 'El respeto al derecho ajeno es la paz'?");
                    respuesta = "benito juarez";
                    break;
                case 3: 
                    jtf_pregunta.setText("¿Quién fue el primer presidente de México?");
                    respuesta = "guadalupe victoria";
                    break;
                case 4:
                    jtf_pregunta.setText("¿Cuántos años duro el porfiriato?");
                    respuesta = "30 años";
                    break;
                case 5:
                    jtf_pregunta.setText("¿En qué año inicio la primer guerra mundial?");
                    respuesta = "1914";
                    break;
                case 6:
                    jtf_pregunta.setText("¿Quién fue el lider de los Nazis?");
                    respuesta = "adolf hitler";
                    break;
                case 7:
                    jtf_pregunta.setText("¿Quién es el actual presidente de México?");
                    respuesta = "enrique peña nieto";
                    break;
                case 8:
                    jtf_pregunta.setText("¿En qué año llegó Hernán Cortes a México?");
                    respuesta = "1519";
                    break;
                case 9:
                    jtf_pregunta.setText("¿Qué continente descubrió Cristóbal Colón?");
                    respuesta = "1942";
                    break;
                case 10:
                    jtf_pregunta.setText("¿Quién fue el primer emperador romano?");
                    respuesta = "cesar augusto";
                    break;
            }
    }
    static void esp(){
        cont++;
            switch(cont){
                case 1:
                    jtf_pregunta.setText("¿En qué silaba llevan el acento tónico las palabras agudas?");
                    respuesta = "en la ultima";
                    break;
                case 2:
                    jtf_pregunta.setText("Es una narración breve de hechos imaginarios o reales, protagonizada por un grupo reducido de personajes y con un argumento sencillo");
                    respuesta = "cuento";
                    break;
                case 3: 
                    jtf_pregunta.setText("Son relatos ficticios que se caracterizan por narrar historias");
                    respuesta = "mitos";
                    break;
                case 4:
                    jtf_pregunta.setText("Es un relato maravilloso fantástico cuya caracteristica principal es formar parte de la cultura de un pueblo");
                    respuesta = "leyenda";
                    break;
                case 5:
                    jtf_pregunta.setText("Es la publicación que se emite diariamente que informa sobre la actualidad");
                    respuesta = "periodico";
                    break;
                case 6:
                    jtf_pregunta.setText("Es la persona por medio de la cual conocemos el relato. La función que cumple es estimular la imaginación e involucrar al lector");
                    respuesta = "narrador";
                    break;
                case 7:
                    jtf_pregunta.setText("Es el modo verbal cuya acción indica orden o mandato");
                    respuesta = "imperativo";
                    break;
                case 8:
                    jtf_pregunta.setText("Son publicaciones impresas que contienen textos e imagenes de uno o varios temas, suelen aparecer en un periodo determinado");
                    respuesta = "revistas";
                    break;
                case 9:
                    jtf_pregunta.setText("¿Cuantas silabas tiene la palabra 'Elefante'?");
                    respuesta = "4";
                    break;
                case 10:
                    jtf_pregunta.setText("Qué es blanco por dentro, verde por fuera. Si quieres que te lo diga, espera");
                    respuesta = "pera";
                    break;
            }
    }
    static void cienc(){
        cont++;
            switch(cont){
                case 1:
                    jtf_pregunta.setText("Es un resto de un ser vivo que se ha petrificado a travez de los años");
                    respuesta = "fosil";
                    break;
                case 2:
                    jtf_pregunta.setText("Como se llama la ciencia que estudia los fósiles");
                    respuesta = "paleontologia";
                    break;
                case 3: 
                    jtf_pregunta.setText("Los seres unicelulares estan conformados por varias celulas. Esta afirmación es verdadera o falsa?");
                    respuesta = "falsa";
                    break;
                case 4:
                    jtf_pregunta.setText("Los seres pluricelulares estan conformados por varias celulas. Esta afirmación es verdadera o falsa?");
                    respuesta = "verdadera";
                    break;
                case 5:
                    jtf_pregunta.setText("En que fase la vida aparece la mestruación femenina");
                    respuesta = "pubertad";
                    break;
                case 6:
                    jtf_pregunta.setText("El clima por las noches en el desierto son friolentas. Si o no ?");
                    respuesta = "si";
                    break;
                case 7:
                    jtf_pregunta.setText("El agua, el aire, la luz solar, los minerales, el suelo y la temperatura son elementos?");
                    respuesta = "abioticos";
                    break;
                case 8:
                    jtf_pregunta.setText("¿Qué color se obtiene si se mezcla azul con amarillo?");
                    respuesta = "verde";
                    break;
                case 9:
                    jtf_pregunta.setText("De donde obtenemos la luz durante el dia?");
                    respuesta = "del sol";
                    break;
                case 10:
                    jtf_pregunta.setText("Cuántas formas de agregación tiene la materia?");
                    respuesta = "3";
                    break;
            }
    }
    static void geogr(){
        cont++;
            switch(cont){
                case 1:
                    jtf_pregunta.setText("¿Qué nombre se le da a una persona que se va del lugar donde ha vivido?");
                    respuesta = "emigrante";
                    break;
                case 2:
                    jtf_pregunta.setText("¿Cómo se llaman los recursos que son capaces de regenerarse?");
                    respuesta = "recursos renovables";
                    break;
                case 3: 
                    jtf_pregunta.setText("¿Cuál es la ciudad más poblada del mundo?");
                    respuesta = "la ciudad de mexico";
                    break;
                case 4:
                    jtf_pregunta.setText("¿Cómo se le conoce a las celebraciones y fiestas de un lugar?");
                    respuesta = "tradiciones";
                    break;
                case 5:
                    jtf_pregunta.setText("¿Cómo se le llama a la actividad que obtiene directamente los recursos de la naturaleza?");
                    respuesta = "actividades primarias";
                    break;
                case 6:
                    jtf_pregunta.setText("Es conocido como meridiano cero");
                    respuesta = "meridiano de greenwich";
                    break;
                case 7:
                    jtf_pregunta.setText("¿Cuál es la capital de Veracruz?");
                    respuesta = "xalapa";
                    break;
                case 8:
                    jtf_pregunta.setText("¿Qué río comparte México con Estados Unidos?");
                    respuesta = "rio bravo";
                    break;
                case 9:
                    jtf_pregunta.setText("¿Cuál es el río más largo del mundo?");
                    respuesta = "rio nilo";
                    break;
                case 10:
                    jtf_pregunta.setText("Esta es una pregunta de control. Escribe tu nombre en la respuesta");
                    respuesta = "tu nombre";
                    break;
            }
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTBtn_start = new javax.swing.JToggleButton();
        number = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        btn_comprobar = new javax.swing.JButton();
        jtf_respuesta = new javax.swing.JTextField();
        jlb_pregunta = new javax.swing.JLabel();
        jlb_respuesta = new javax.swing.JLabel();
        jlb_score = new javax.swing.JLabel();
        jtf_score = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtf_pregunta = new javax.swing.JTextArea();
        btn_next = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTBtn_start.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTBtn_start.setText("Start");
        jTBtn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBtn_startActionPerformed(evt);
            }
        });

        number.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number.setText("TIEMPO :");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bOMBA/grey_bomb (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 32)); // NOI18N
        jLabel2.setText("¿Qué tan rápido eres?");

        time.setEditable(false);
        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 30)); // NOI18N
        time.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        time.setText("1:00");

        btn_comprobar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_comprobar.setText("Check");
        btn_comprobar.setMaximumSize(new java.awt.Dimension(81, 45));
        btn_comprobar.setMinimumSize(new java.awt.Dimension(81, 45));
        btn_comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprobarActionPerformed(evt);
            }
        });

        jlb_pregunta.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jlb_pregunta.setText("Pregunta:");

        jlb_respuesta.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jlb_respuesta.setText("Respuesta:");

        jlb_score.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jlb_score.setText("Score:");

        jtf_score.setText("0");

        jtf_pregunta.setColumns(20);
        jtf_pregunta.setRows(5);
        jScrollPane1.setViewportView(jtf_pregunta);

        btn_next.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivos");

        jMenuItem1.setText("Jugar de Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem3.setText("Instruciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setText("Ver respuesta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlb_score)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_score, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(number)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_respuesta)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb_pregunta)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTBtn_start)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtf_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb_score))
                        .addGap(25, 25, 25)
                        .addComponent(jlb_pregunta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlb_respuesta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_next)
                            .addComponent(jTBtn_start)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBtn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBtn_startActionPerformed
        // TODO add your handling code here:
       run();
       h1.start();
       jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bOMBA/bomb (4).png")));
        switch(team){
            case "matematicas":
                mat();
                break;
            case "ingles":
                ing();
                break;
            case "historia":
                hist();
                break;
            case "español":
                esp();
                break;
            case "ciencias":
                cienc();
                break;
            case "geografia":
                geogr();
                break;
    }
       
    }//GEN-LAST:event_jTBtn_startActionPerformed

    private void btn_comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprobarActionPerformed
        // TODO add your handling code here:
        String resp = jtf_respuesta.getText();

        if (resp.equals(respuesta)){
            JOptionPane.showMessageDialog(null,"¡Correcto! Siguiente pregunta");
            score++;
            scoreS = String.valueOf(score);
            jtf_score.setText(scoreS);
            jtf_respuesta.setText(null);
            switch(team){
            case "matematicas":
                mat();
                break;
            case "ingles":
                ing();
                break;
            case "historia":
                hist();
                break;
            case "español":
                esp();
                break;
            case "ciencias":
                cienc();
                break;
            case "geografia":
                geogr();
                break;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Incorrecto! Sigue intentando");
        }
        
    }//GEN-LAST:event_btn_comprobarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
        menu.main(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Conviertete en el mejor respondiendo todas las preguntas que puedas en menos de un minuto. Ten en cuneta que no podras regresar a alguna pregunta si no la contestaste");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null,"Respuesta: "+respuesta);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        switch(team){
            case "matematicas":
                mat();
                break;
            case "ingles":
                ing();
                break;
            case "historia":
                hist();
                break;
            case "español":
                esp();
                break;
            case "ciencias":
                cienc();
                break;
            case "geografia":
                geogr();
                break;
            }
    }//GEN-LAST:event_btn_nextActionPerformed

    
    /**/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Castle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Castle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Castle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Castle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Castle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comprobar;
    private static javax.swing.JButton btn_next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBtn_start;
    private javax.swing.JLabel jlb_pregunta;
    private javax.swing.JLabel jlb_respuesta;
    private javax.swing.JLabel jlb_score;
    private static javax.swing.JTextArea jtf_pregunta;
    private static javax.swing.JTextField jtf_respuesta;
    private javax.swing.JTextField jtf_score;
    private javax.swing.JLabel number;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
