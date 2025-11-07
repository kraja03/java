package com.sparta.mocking;
import com.sparta.mocking.model.Spartan;
import com.sparta.mocking.repository.Repository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class SpartanServiceTest {
    private SpartanService sut;
    private Repository mockRepository;

    @BeforeEach
    public void setUp(){
        mockRepository = Mockito.mock(Repository.class);
        // mockRepository is acting like a dummy
        sut = new SpartanService(mockRepository);
    }


    @Test
    @DisplayName("Given a list of two Spartans getNumSpartans returns 2")
    public void givenListOfTwoSpartans_getNumSpartans_Returns2(){
        List<Spartan> spartans = new ArrayList<>();
        spartans.add(Mockito.mock(Spartan.class));
        spartans.add(Mockito.mock(Spartan.class));
        // my stub!
        Mockito.when(mockRepository.getAll()).thenReturn(spartans);
        var result = sut.getNumSpartans();
        assertThat(result, is(2));
    }

    @Test
    @DisplayName("Given a Spartan exists, findSpartan should return it")
    void givenSpartanExists_findSpartan_ReturnsSpartan() {
        Mockito.when(mockRepository.find(Mockito.anyInt()))
                .thenReturn(Mockito.mock(Spartan.class));
        var result = sut.findSpartan(Mockito.anyInt());
        assertThat(result, instanceOf(Spartan.class));
    }

    @Test
    @DisplayName("Given a Spartan doesn't exist, findSpartan should throw a RuntimeException")
    void givenSpartanDoesNotExist_findSpartan_ThrowsRuntimeException() {
        Mockito.when(mockRepository.find(Mockito.anyInt()))
                .thenThrow(new NoSuchElementException());
        Assertions.assertThrows(RuntimeException.class, () -> sut.findSpartan(1));
    }

    @Test
    @DisplayName("Check find is called once")
    public void checkFindIsCalledOnceOnRepository(){
        sut.findSpartan(1);
        Mockito.verify(mockRepository).find(1);
    }

    @Test
    @DisplayName("Test correct parameter passed")
    void testCorrectParameterPassed() {
        Spartan spartan = new Spartan("Nish", "Java", LocalDate.now());
        sut.addSpartan(spartan);
        Mockito.verify(mockRepository).add(spartan);
    }

    @Test
    @DisplayName("Given spartan is removed, RemovesSpartan should remove spartan" )
    public void removeSpartanHappyTest(){
        Mockito.when(mockRepository.remove(Mockito.anyInt()))
                .thenReturn(true);
        var result = sut.removeSpartan(1);
        assertThat(result, is(true));
        Mockito.verify(mockRepository).remove(1);
    }
    @Test
    @DisplayName("Given spartan cannot be removed, RemovesSpartan should return false" )
    public void removeSpartanSadTest(){
        Mockito.when(mockRepository.remove(Mockito.anyInt()))
                .thenThrow(new RuntimeException("Failed to remove Spartan"));
        Assertions.assertThrows(RuntimeException.class, () -> sut.removeSpartan(1));
        Mockito.verify(mockRepository).remove(1);
    }
    //nish's tests for remove spartan
//    @Test
//    @DisplayName("Removing a Spartan that exists returns true")
//    void removingSpartanThatExists_returnsTrue() {
//        Mockito.when(mockRepository.remove(Mockito.anyInt()))
//                .thenReturn(true);
//        Assertions.assertTrue(sut.removeSpartan(1));
//    }
//
//    @Test
//    @DisplayName("Removing a Spartan that doesn't exist returns false")
//    void removingSpartanThatDoesNotExist_returnsFalse() {
//        Mockito.when(mockRepository.remove(Mockito.anyInt()))
//                .thenReturn(false);
//        Assertions.assertFalse(sut.removeSpartan(1));
//    }

    @Test
    @DisplayName("removeSpartan should call repository.remove() exactly once with the correct ID")
    void removeSpartan_ShouldCallRepositoryRemoveOnce() {
        Mockito.when(mockRepository.remove(Mockito.anyInt())).thenReturn(true);

        sut.removeSpartan(1);

        Mockito.verify(mockRepository, Mockito.times(1)).remove(1);
    }


    @Test
    @DisplayName("removeSpartan should only call repository.remove() and nothing else")
    void removeSpartan_ShouldOnlyCallRemove() {
        Mockito.when(mockRepository.remove(Mockito.anyInt())).thenReturn(true);

        sut.removeSpartan(1);

        Mockito.verify(mockRepository).remove(1);
        Mockito.verifyNoMoreInteractions(mockRepository);
    }


    @Test
    @DisplayName("removeSpartan should still call repository.remove() even if an exception is thrown")
    void removeSpartan_ShouldCallRepositoryRemove_WhenExceptionThrown() {
        Mockito.when(mockRepository.remove(Mockito.anyInt()))
                .thenThrow(new RuntimeException("Error removing Spartan"));

        Assertions.assertThrows(RuntimeException.class, () -> sut.removeSpartan(1));

        Mockito.verify(mockRepository).remove(1);
    }

    @Test
    @DisplayName("removeSpartan should return true when repository.remove() returns true")
    void removeSpartan_ShouldReturnTrue_WhenRepositoryReturnsTrue() {
        Mockito.when(mockRepository.remove(Mockito.anyInt())).thenReturn(true);

        var result = sut.removeSpartan(1);

        assertThat(result, is(true));
        Mockito.verify(mockRepository).remove(1);
    }

    @Test
    @DisplayName("getSpartansCreatedLast24Hours returns only Spartans from last 24 hours")
    void getSpartansCreatedLast24Hours_ReturnsRecentSpartans() {
        Spartan recent = new Spartan("Recent", "Java", LocalDate.now());
        Spartan old = new Spartan("Old", "Java", LocalDate.now().minusDays(5));

        Mockito.when(mockRepository.getAll()).thenReturn(List.of(recent, old));

        var result = sut.getSpartansCreatedLast24Hours();

        assertThat(result, is(List.of(recent)));
    }

    @Test
    @DisplayName("getSpartansCreatedLast24Hours should call repository.getAll()")
    void getSpartansCreatedLast24Hours_ShouldCallRepositoryGetAll() {
        sut.getSpartansCreatedLast24Hours();
        Mockito.verify(mockRepository).getAll();
    }




}

