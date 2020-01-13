package proyecto.de.animacionpilas;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Stack;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {


    ImageView pikachu;
    ImageView duck, huevo, evee, jiggly, squartle;
    Vector<ImageView> vector ;
    Stack arr;

    public int control = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vector = new Vector<ImageView>();


        huevo = findViewById(R.id.huevo);
        pikachu = findViewById(R.id.pikachu);
        evee = findViewById(R.id.evee);
        jiggly = findViewById(R.id.jigly);
        duck = findViewById(R.id.duck);

        vector.add(duck);
        vector.add(evee);
        vector.add(jiggly);
        vector.add(pikachu);
        vector.add(huevo);





        arr = new Stack();

    }

    public void eliminar(View view){
        control--;
        if(control>=0){
        /////////////////////////////////       HUEVO
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(arr.pop(),"alpha",0f);
        animator7.setDuration(1000); // duration 3 seconds
        animator7.start();
        }
        else{
            Toast.makeText(this, "Pila Vacia", Toast.LENGTH_SHORT).show();
        }
    }

    public void llenar(View view){
        float alturaX = 700f;
        float proporcionY = 260f;


        if(control>=0){
            poner(vector.elementAt(control), alturaX, proporcionY*(4-control));
            arr.push(vector.elementAt(control));
            control++;
        }else {
            control=0;
            poner(vector.elementAt(control), alturaX, proporcionY*(4-control));
            arr.push(vector.elementAt(control));
            control++;
        }



    }

    public void poner(ImageView poke, float alturaX, float proporY){

        ObjectAnimator animator77 = ObjectAnimator.ofFloat(poke,"alpha",1f);
        animator77.start();

        ObjectAnimator animator33 = ObjectAnimator.ofFloat(poke, "x", alturaX);
        animator33.setDuration(1000);
        AnimatorSet animatorSet33 = new AnimatorSet();
        animatorSet33.play(animator33);
        animatorSet33.start();


        ObjectAnimator animator4 = ObjectAnimator.ofFloat(poke, "y", proporY);
        animator4.setDuration(1500);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.play(animator4);
        animatorSet4.start();
    }

    public void handleAnimation(View view){

        float alturaX = 700f;
        float proporcionY = 260f;
        //////////////////////////////////////      DUCK

        ObjectAnimator animator3 = ObjectAnimator.ofFloat(duck, "x", alturaX);
        animator3.setDuration(1000);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(animator3);
        animatorSet3.start();


        ObjectAnimator animator4 = ObjectAnimator.ofFloat(duck, "y", proporcionY*4);
        animator4.setDuration(4000);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.play(animator4);
        animatorSet4.start();


        /////////////////////////////////       JIGGLE

        ObjectAnimator animator9 = ObjectAnimator.ofFloat(jiggly, "x", alturaX);
        animator9.setDuration(2400);
        AnimatorSet animatorSet9 = new AnimatorSet();
        animatorSet9.play(animator9);
        animatorSet9.start();


        ObjectAnimator animator10 = ObjectAnimator.ofFloat(jiggly, "y", proporcionY*3);
        animator10.setDuration(6000);
        AnimatorSet animatorSet10 = new AnimatorSet();
        animatorSet10.play(animator10);
        animatorSet10.start();

        /////////////////////////////////       EVEE

        ObjectAnimator animator5 = ObjectAnimator.ofFloat(evee, "x", alturaX);
        animator5.setDuration(2400);
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.play(animator5);
        animatorSet5.start();


        ObjectAnimator animator6 = ObjectAnimator.ofFloat(evee, "y", proporcionY*2);
        animator6.setDuration(6000);
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.play(animator6);
        animatorSet6.start();

        /////////////////////////////////       PIKACHU

        ObjectAnimator animator1 = ObjectAnimator.ofFloat(pikachu, "x", alturaX);
        animator1.setDuration(2400);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animator1);
        animatorSet.start();


        ObjectAnimator animator2 = ObjectAnimator.ofFloat(pikachu, "y", proporcionY*1);
        animator2.setDuration(6000);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(animator2);
        animatorSet2.start();

        /////////////////////////////////       HUEVO

        ObjectAnimator animator7 = ObjectAnimator.ofFloat(huevo, "x", alturaX);
        animator7.setDuration(2400);
        AnimatorSet animatorSet7 = new AnimatorSet();
        animatorSet7.play(animator7);
        animatorSet7.start();


        ObjectAnimator animator8 = ObjectAnimator.ofFloat(huevo, "y", proporcionY*0);
        animator8.setDuration(6000);
        AnimatorSet animatorSet8 = new AnimatorSet();
        animatorSet8.play(animator8);
        animatorSet8.start();



        /*
        float altura = 0;
        for(int i=0; i<arr.size() ;i++){
            animar(arr.elementAt(i), 1200f);
        }
        */
    }

    public static void animar(int cosa, float tante){
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(cosa, "x", 700f);
        animator1.setDuration(500);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animator1);
        animatorSet.start();

        /////
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(cosa, "y", tante);
        animator2.setDuration(2000);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(animator2);
        animatorSet2.start();
    }

}
