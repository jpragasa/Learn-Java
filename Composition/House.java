package learning.Composition;

public class House
{
    private LivingRoom livingRoom;
    private Kitchen kitchen;
    private Bedroom bedroom;

    public House(LivingRoom livingRoom, Kitchen kitchen, Bedroom bedroom)
    {
        this.livingRoom = livingRoom;
        this.kitchen = kitchen;
        this.bedroom = bedroom;
    }

    public void AlternateTVOnOrOff()
    {
        livingRoom.turnOnTV();
    }

    public void AlternateSinkOnOrOff()
    {
        kitchen.AlternateOnAndOffSink();
    }

    public void OpenOrCloseFridge()
    {
        kitchen.isFridgeOpen();
    }

    public void AlternateOnOrOffBedroomTV()
    {
        bedroom.turnOnTV();
    }
}
