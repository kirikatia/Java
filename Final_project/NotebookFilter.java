package lesson_4;

public class NotebookFilter {
    public int filterId = 0;
    private int min = -1;
    private int max = -1;
    private String text = null;
    
    public NotebookFilter(int filterId, int min, int max)
    {
        this.filterId = filterId;
        this.min = min;
        this.max = max;
    }

    public NotebookFilter(int filterId, String text)
    {
        this.filterId = filterId;
        this.text = text;
    }

    private boolean isMinMaxMatch(Notebook notebook)
    {
        int value = 0;
        switch(filterId)
        {
            case 1:
                value = notebook.getRam();
                break;
            case 2:
                value = notebook.getHdd();
                break;
        }
        return value >= min && value <= max;
    }

    private boolean isTextMatch(Notebook notebook)
    {
        String value = null;
        switch(filterId)
        {
            case 3:
                value = notebook.getOs();
                break;
            case 4:
                value = notebook.getColor();
                break;
        }
        return value.contains(text);
    }

    public boolean isMatch(Notebook notebook)
    {
        switch(filterId)
        {
            case 1:
            case 2:
                return isMinMaxMatch(notebook);
            case 3:
            case 4:
                return isTextMatch(notebook);
            default:
                return false;
        }
    }
}
