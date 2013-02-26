
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

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
    public void deveEstourarNoSuchElementExceptionAoInserirERemoverItemDaFrenteEDepoisRemoverUmItemPorTras() {
        try{
            subject.addFirst("t");
            subject.removeFirst();
            subject.removeLast();
            fail("Exception not thrown");
        }catch(java.util.NoSuchElementException e){
            assert true;
        }
    }

    @Test
    public void deveEstourarNoSuchElementExceptionAoInserirERemoverItemDeTrasEDepoisRemoverUmItemPelaFrente() {
        try{
            subject.addLast("t");
            subject.removeLast();
            subject.removeFirst();
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

    @Test
    public void deveDesmarMarcarComoVazioAoAdicionar1ItemAtras() {
        subject.addLast("t");
        assertFalse(subject.isEmpty());
    }

    @Test
    public void deveTerTamanho1AoIniciarAdicionar1ItemAtras() {
        subject.addLast("t");
        assertEquals(1, subject.size());
    }

    @Test
    public void deveAdicionarUmItemEResgataloAtras() {
        subject.addLast("teste");
        assertEquals("teste", subject.removeFirst());
    }

    @Test
    public void deveMarcarComoVazioAoAdicionarRemoverItemAtras() {
        subject.addLast("t");
        subject.removeLast();
        assertTrue(subject.isEmpty());
    }

    @Test
    public void deveTerTamanhoZeroAoAdicionarRemoverItemAtras() {
        subject.addLast("t");
        subject.removeLast();
        assertEquals(0, subject.size());
    }

    @Test
    public void deveRetornarSegundoItemAoAdicionar2Atras() {
        subject.addLast("teste 1");
        subject.addLast("teste 2");
        assertEquals("teste 2", subject.removeLast());
    }

    @Test
    public void deveRetornarPrimeiroItemAoAdicionarRemover3SeguidosAtras() {
        subject.addLast("teste 1");
        subject.addLast("teste 2");
        subject.addLast("teste 3");
        subject.removeLast();
        subject.removeLast();
        assertEquals("teste 1", subject.removeLast());
    }

    @Test
    public void deveRetornarItemDaFrenteAoAdicionar3SeguidosAtras() {
        subject.addLast("teste 1");
        subject.addLast("teste 2");
        subject.addLast("teste 3");
        assertEquals("teste 1", subject.removeFirst());
    }

    @Test
    public void deveRetornarItemDeTrasAoAdicionar3AtrasRemover3SeguidosNaFrente() {
        subject.addLast("teste 1");
        subject.addLast("teste 2");
        subject.addLast("teste 3");
        subject.removeFirst();
        subject.removeFirst();
        assertEquals("teste 3", subject.removeFirst());
    }

    @Test
    public void deveRetornarItemPelaFrenteQueFoiAdicionadoPorAtras() {
        subject.addLast("teste 1");
        assertEquals("teste 1", subject.removeLast());
    }

    @Test
    public void deveRetornarIteratorVazioSeNadaForAdicionado() {
        assertFalse(subject.iterator().hasNext());
    }

    @Test
    public void deveRetornarIteratorNãoVazioUmItemForAdicionadoAnteriormentePorTras() {
        subject.addLast("t");
        assertTrue(subject.iterator().hasNext());
    }

    @Test
    public void deveRetornarIteratorNãoVazioUmItemForAdicionadoAnteriormentePelaFrente() {
        subject.addFirst("t");
        assertTrue(subject.iterator().hasNext());
    }

    @Test
    public void deveFazerLoopPelosItensAdicionadosNoIteratorAnteriormentePorTras() {
        subject.addLast("t1");
        subject.addLast("t2");
        subject.addLast("t3");
        String assertTest = "";
        for(String t : subject)
            assertTest += t;
        assertEquals("t1t2t3", assertTest);
    }

    @Test
    public void deveFazerLoopPelosItensAdicionadosNoIteratorAnteriormentePelaFrente() {
        subject.addFirst("t1");
        subject.addFirst("t2");
        subject.addFirst("t3");
        String assertTest = "";
        for(String t : subject)
            assertTest += t;
        assertEquals("t3t2t1", assertTest);
    }

    @Test
    public void deveEstourarUnsupportedOperationExceptionAoTentarRemoverItemPeloInterator() {
        try{
            subject.iterator().remove();
            fail("Exception not thrown");
        }catch(UnsupportedOperationException e){
            assert true;
        }
    }
    
}
