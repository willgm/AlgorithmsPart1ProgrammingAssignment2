/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author William
 */
public class DequeTest {
    
    Deque<String> subject;
    
    @Before
    public void setUp() {
        subject = new Deque<>();
    }

    @Test
    public void deveMarcarComoVazioAoIniciar() {
        assertTrue(subject.isEmpty());
    }

    @Test
    public void deveTerTamanhoZeroAoIniciar() {
        assertEquals(0, subject.size());
    }

    @Test
    public void deveEstourarNullPointerExceptionAoAdicionarItemNuloAFrente() {
        try{
            subject.addFirst(null);
            fail("Exception not thrown");
        }catch(NullPointerException e){
            assert true;
        }
    }

    @Test
    public void deveEstourarNullPointerExceptionAoAdicionarItemNuloATras() {
        try{
            subject.addLast(null);
            fail("Exception not thrown");
        }catch(NullPointerException e){
            assert true;
        }
    }

    @Test
    public void deveEstourarNoSuchElementExceptionAoRemoverItemDaFrenteQuandoEstaVazio() {
        try{
            subject.removeFirst();
            fail("Exception not thrown");
        }catch(java.util.NoSuchElementException e){
            assert true;
        }
    }

    @Test
    public void deveEstourarNoSuchElementExceptionAoRemoverItemDeTrasQuandoEstaVazio() {
        try{
            subject.removeLast();
            fail("Exception not thrown");
        }catch(java.util.NoSuchElementException e){
            assert true;
        }
    }
}
