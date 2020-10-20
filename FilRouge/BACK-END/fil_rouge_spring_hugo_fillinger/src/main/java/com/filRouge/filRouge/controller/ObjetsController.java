package com.filRouge.filRouge.controller;
import com.filRouge.filRouge.Job.CompositionJob;
import com.filRouge.filRouge.Job.SquareJob;
import com.filRouge.filRouge.dao.CompositionDao;
import com.filRouge.filRouge.dao.ObjectsDao;
import com.filRouge.filRouge.objects.Composition;
import com.filRouge.filRouge.objects.ObjectGeo;
import com.filRouge.filRouge.objects.Square;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ObjetsController {

    @Autowired
    private ObjectsDao objectsDao;

    @Autowired
    private CompositionDao compositionDao;

    // Objets

    @GetMapping(value = "Objets")
    public  List<ObjectGeo> listeObjets(){
        return objectsDao.findAll();
    }

    //Objets/{id}

    @GetMapping(value = "Objets/{id}")
    public  ObjectGeo displayObjects(@PathVariable int id){
        return objectsDao.findById(id).get();
    }


  // Create a new square
    @PostMapping(value = "/Objets/square")
    public ObjectGeo createSquare(@RequestBody SquareJob square) {

      ObjectGeo newSquare = objectsDao.save(new Square(square, compositionDao.findById(square.getComposition()).orElse(null)));
      return newSquare;
    }

    @PostMapping(value = "/Objets/square/{id}")
    public ObjectGeo createSquareWithCompositionId(@RequestBody SquareJob square, @PathVariable Integer id) {
        Composition composition = compositionDao.findById(id).orElse(null);
      ObjectGeo newSquare = objectsDao.save(new Square(square, composition));
      return newSquare;
    }

    // PUT method for objects

    @PutMapping(value = "/Objet/edit/{id}")
    public ResponseEntity editObjet(@RequestBody ObjectGeo objet, @PathVariable Integer id) {
        Optional<ObjectGeo> newObjetOptional = objectsDao.findById(id);
        if (newObjetOptional.isPresent()){
            ObjectGeo newObjet = newObjetOptional.get();
            newObjet.setName(objet.getName());
            newObjet.setTypeOfObject(objet.getTypeOfObject());
            newObjet.setSide(objet.getSide());
            newObjet.setLength(objet.getLength());
            newObjet.setWidth(objet.getWidth());
            newObjet.setColor(objet.getColor());
            newObjet.setX(objet.getX());
            newObjet.setY(objet.getY());
            newObjet.setArea(objet.getArea());
            newObjet.setPerimeter(objet.getPerimeter());
            objectsDao.save(newObjet);
            return new ResponseEntity(HttpStatus.ACCEPTED);
        }      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    // Objets delete

    @DeleteMapping (value = "/Objets/Delete/{id}")
    public void supprimerProduit(@PathVariable int id) {

        objectsDao.deleteById(id);

    }

    // Composition  GET all

    @GetMapping(value = "Composition")
    public  List<Composition> listeComposition(){
        return compositionDao.findAll();
    }

    // GET Composition/{id}

    @GetMapping(value = "Composition/{id}")
    public  Composition displayComposition(@PathVariable int id){
        return compositionDao.findById(id).get();
    }

    //Objets/Composition/{id}

    @GetMapping(value = "Objets/Composition/{id}")
    public  List<ObjectGeo> displayObjectsByComposition(@PathVariable int id){
        List<ObjectGeo> result = objectsDao.findAll();
        result.removeIf(s -> s.getComposition().getId() != id);
        return result;
    }

    // Create a new composition

    @PostMapping(value = "/Composition")
    public Composition createComposition(@RequestBody CompositionJob compo){
        Composition newCompo = compositionDao.save(new Composition(compo));
        return newCompo;
    }

    // Composition delete

    @DeleteMapping (value = "/Composition/Delete/{id}")
    public void supprimerComposition(@PathVariable int id) {

        compositionDao.deleteById(id);

    }



}
