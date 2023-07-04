```java
package com.placementapp.service;

import com.placementapp.model.Placement;
import com.placementapp.repository.PlacementRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PlacementServiceTests {

    @InjectMocks
    private PlacementService placementService;

    @Mock
    private PlacementRepository placementRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPlacements() {
        Placement placement1 = new Placement("Google", "Software Engineer", "Accepted");
        Placement placement2 = new Placement("Microsoft", "Software Engineer", "Pending");
        List<Placement> placements = Arrays.asList(placement1, placement2);

        when(placementRepository.findAll()).thenReturn(placements);

        List<Placement> result = placementService.getPlacements();
        assertEquals(2, result.size());
    }

    @Test
    public void testAddPlacement() {
        Placement placement = new Placement("Amazon", "Software Engineer", "Applied");

        when(placementRepository.save(placement)).thenReturn(placement);

        Placement result = placementService.addPlacement(placement);
        assertEquals("Amazon", result.getCompany());
    }
}
```