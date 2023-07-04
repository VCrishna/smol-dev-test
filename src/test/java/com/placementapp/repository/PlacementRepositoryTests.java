```java
package com.placementapp.repository;

import com.placementapp.model.Placement;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class PlacementRepositoryTests {

    @Autowired
    private PlacementRepository placementRepository;

    @Test
    public void testSavePlacement() {
        Placement placement = new Placement();
        placement.setName("Test Placement");
        placement.setDescription("Test Description");

        Placement savedPlacement = placementRepository.save(placement);

        assertEquals(placement.getName(), savedPlacement.getName());
        assertEquals(placement.getDescription(), savedPlacement.getDescription());
    }

    @Test
    public void testFindPlacementById() {
        Placement placement = new Placement();
        placement.setName("Test Placement");
        placement.setDescription("Test Description");

        Placement savedPlacement = placementRepository.save(placement);
        Optional<Placement> foundPlacement = placementRepository.findById(savedPlacement.getId());

        assertTrue(foundPlacement.isPresent());
        assertEquals(savedPlacement.getId(), foundPlacement.get().getId());
    }
}
```