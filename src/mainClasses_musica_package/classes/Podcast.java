package mainClasses_musica_package.classes;

public class Podcast extends Audio {
    private String podcastHost;
    private String podcastName;
    private int episodeNumber;
    private int numberOfEpisodes;

    public String getPodcastHost() {
        return podcastHost;
    }

    public void setPodcastHost(String podcastHost) {
        this.podcastHost = podcastHost;
    }

    public String getPodcastName() {
        return podcastName;
    }

    public void setPodcastName(String podcastName) {
        this.podcastName = podcastName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }
}
