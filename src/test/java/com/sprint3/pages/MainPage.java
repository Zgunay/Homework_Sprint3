package com.sprint3.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage {

    @FindBy (xpath = "//*[@id='left-menu-settings']")
    public WebElement Configure;


    @FindBy(xpath = "//span[.='Add custom menu item']")
    public WebElement AddCustomMenu;

    @FindBy(xpath = "//span[.='Collapse menu']")
    public WebElement CoolapseMenu;

    @FindBy(id = "left-menu-resizer-button")
    public WebElement CoolapseCheckButton;


    @FindBy(xpath = "//span[.='Reset menu']")
    public WebElement ResetMenu;

    @FindBy(name = "menuPageToFavoriteName")
    public WebElement NameInputBox;

    @FindBy(name = "menuPageToFavoriteLink")
    public WebElement LinkInputBox;

    @FindBy(xpath= "//span[.='Add']")
    public WebElement AddButton;

    @FindBy (id = "menuOpenInNewPage")
    public WebElement OpenInTabCheckBox;

    @FindBy (xpath = "//a/span[contains(.,'Google')][@class='menu-item-link-text']")
    public WebElement AddedMenu;

@FindBy(xpath = "//span[starts-with(@class,'menu-fav-editable-btn')]")
    public List<WebElement>  EditMenu;



     //span[contains(.,'Hide item')][@class='menu-popup-item-text']   hide

    //span[contains(.,'Delete custom item')][@class='menu-popup-item-text']   delete

    //span[contains(.,'Edit')][@class='menu-popup-item-text']   edit
             //span[contains(.,'Edit')][@class='popup-window-titlebar-text']

    //span[contains(.,'More')][@class='menu-favorites-more-text']   More



}
