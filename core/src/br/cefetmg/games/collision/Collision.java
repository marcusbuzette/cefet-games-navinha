package br.cefetmg.games.collision;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;

/**
 * Utilitário para verificação de colisão.
 *
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public class Collision {

    /**
     * Verifica se dois círculos em 2D estão colidindo.
     * @param c1 círculo 1
     * @param c2 círculo 2
     * @return true se há colisão ou false, do contrário.
     */
    public static final boolean circlesOverlap(Circle c1, Circle c2) {
        float raioC1 = c1.radius;
        float posX1 = c1.x;
        float posY1 = c1.y;
        
        float raioC2 = c2.radius;
        float posX2 = c2.x;
        float posY2 = c2.y;
        
        
        
        if ((c1.y - c1.radius) <= (c2.y + c2.radius)){
            if (c1.x > c2.x && ((c1.x - c2.x) <= (c1.radius + c2.radius) )) {
                return true;
            }
            if (c1.x < c2.x && ((c2.x - c1.x) <= (c2.radius + c1.radius) )) {
                return true;
            }
            if (c1.x == c2.x) {
                return true;
            }
            return false;
        } else {
            return false;
        }
       
        
                
        
    }

    /**
     * Verifica se dois retângulos em 2D estão colidindo.
     * Esta função pode verificar se o eixo X dos dois objetos está colidindo
     * e então se o mesmo ocorre com o eixo Y.
     * @param r1 retângulo 1
     * @param r2 retângulo 2
     * @return true se há colisão ou false, do contrário.
     */
    public static final boolean rectsOverlap(Rectangle r1, Rectangle r2) {
        System.out.println("raio c1: " + r1.y);
//                System.out.println("X c1: " + posX1);
//                System.out.println("Y c1: " + posY1);
        if (r1.x == r2.x || (r1.x <= r2.x + r2.width) && (r1.x >= r2.x)) {
//            if ()
            return true;
        } else {
           return false; 
        }
        
    }
}
