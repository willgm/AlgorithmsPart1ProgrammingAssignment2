/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

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

    @Test
    public void deveDesmarMarcarComoVazioAoAdicionar1ItemNaFrente() {
        subject.addFirst("t");
        assertFalse(subject.isEmpty());
    }

    @Test
    public void deveTerTamanho1AoIniciarAdicionar1ItemNaFrente() {
        subject.addFirst("t");
        assertEquals(1, subject.size());
    }

    @Test
    public void deveAdicionarUmItemEResgataloDaFrente() {
        subject.addFirst("teste");
        assertEquals("teste", subject.removeFirst());
    }

    @Test
    public void deveMarcarComoVazioAoAdicionarRemoverItemDaFrente() {
        subject.addFirst("t");
        subject.removeFirst();
        assertTrue(subject.isEmpty());
    }

    @Test
    public void deveTerTamanhoZeroAoAdicionarRemoverItemDaFrente() {
        subject.addFirst("t");
        subject.removeFirst();
        assertEquals(0, subject.size());
    }

    @Test
    public void deveRetornarSegundoItemAoAdicionar2NaFrente() {
        subject.addFirst("teste 1");
        subject.addFirst("teste 2");
        assertEquals("teste 2", subject.removeFirst());
    }

    @Test
    public void deveRetornarPrimeiroItemAoAdicionarRemover2SeguidosDaFrente() {
        subject.addFirst("teste 1");
        subject.addFirst("teste 2");
        subject.removeFirst();
        assertEquals("teste 1", subject.removeFirst());
    }
}
