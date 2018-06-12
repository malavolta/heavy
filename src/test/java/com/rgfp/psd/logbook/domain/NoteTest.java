package com.rgfp.psd.logbook.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class NoteTest {

    @Test
    public void deberiaDevolver240caracteresCuandoLaNotaSeaMayor() {
        // arrange
        String content = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años";
        Note note = new Note();
        note.setContent(content);
        // act
        String result = note.getSummary();
        // assert
        assertEquals(240, result.length());
    }

}