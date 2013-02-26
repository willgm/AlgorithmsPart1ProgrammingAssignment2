
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomizedQueueTest {
    
    RandomizedQueue<String> subject;
    
    @Before
    public void setUp() {
        subject = new RandomizedQueue<>();
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
    public void deveEstourarNullPointerExceptionAoAdicionarItemNulo() {
        try{
            subject.enqueue(null);
            fail("Exception not thrown");
        }catch(NullPointerException e){
            assert true;
        }
    }

    @Test
    public void deveEstourarNoSuchElementExceptionAoRemoverItemQuandoEstaVazio() {
        try{
            subject.dequeue();
            fail("Exception not thrown");
        }catch(java.util.NoSuchElementException e){
            assert true;
        }
    }

    @Test
    public void deveEstourarNoSuchElementExceptionAoObterItemQuandoEstaVazio() {
        try{
            subject.sample();
            fail("Exception not thrown");
        }catch(java.util.NoSuchElementException e){
            assert true;
        }
    }

    @Test
    public void deveEstourarNoSuchElementExceptionAoInserirERemoverItemEDepoisTentarRemoverNovamente() {
        try{
            subject.enqueue("t");
            subject.dequeue();
            subject.dequeue();
            fail("Exception not thrown");
        }catch(java.util.NoSuchElementException e){
            assert true;
        }
    }

    @Test
    public void deveDesmarMarcarComoVazioAoAdicionarUmItem() {
        subject.enqueue("t");
        assertFalse(subject.isEmpty());
    }

    @Test
    public void deveTerTamanho1AoIniciarAdicionarUmItem() {
        subject.enqueue("t");
        assertEquals(1, subject.size());
    }
    
}
