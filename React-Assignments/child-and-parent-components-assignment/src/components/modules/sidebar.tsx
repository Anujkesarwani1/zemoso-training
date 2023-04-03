import { styled, ListItemText, ListItemIcon, ListItemButton, ListItem, List, Box, Paper } from '@mui/material'
import WindowIcon from '@mui/icons-material/Window';
import PeopleAltOutlinedIcon from '@mui/icons-material/PeopleAltOutlined';
import GavelIcon from '@mui/icons-material/Gavel';
import DescriptionOutlinedIcon from '@mui/icons-material/DescriptionOutlined';
import InsertChartOutlinedIcon from '@mui/icons-material/InsertChartOutlined';
import ManageAccountsOutlinedIcon from '@mui/icons-material/ManageAccountsOutlined';
import ArticleOutlinedIcon from '@mui/icons-material/ArticleOutlined';

const MuiPaper = styled(Paper)({
  padding: '1rem',
  width: '17%',
  paddingBottom: "12rem",
});

const MuiBox = styled(Box)({
  width: '100%',
  maxWidth: 360,
  color: 'darkblue',
});

const MuiWindowIcon = styled(WindowIcon)({
  color: 'darkblue',
});

const MuiListItemText = styled(ListItemText)({
  color: 'black',
  '&:hover': {
    color: 'darkblue',
  },
});

const MuiPeopleAltOutlinedIcon = styled(PeopleAltOutlinedIcon)({
  color: 'darkblue',
});

const MuiGavelIcon = styled(GavelIcon)({
  color: 'darkblue',
});

const MuiDescriptionOutlinedIcon = styled(DescriptionOutlinedIcon)({
  color: 'darkblue',
});

const MuiInsertChartOutlinedIcon = styled(InsertChartOutlinedIcon)({
  color: 'darkblue',
});

const MuiManageAccountsOutlinedIcon = styled(ManageAccountsOutlinedIcon)({
  color: 'darkblue',
});

const MuiArticleOutlinedIcon = styled(ArticleOutlinedIcon)({
  color: 'darkblue',
});

const Sidebar = () => {
  return (
    <MuiPaper elevation={3}>
      <MuiBox>
        <h2>RECRUIT</h2>
        <List>
          <ListItem disablePadding>
            <ListItemButton>
              <ListItemIcon>
                <MuiWindowIcon />
              </ListItemIcon>
              <MuiListItemText primary="Home" />
            </ListItemButton>
          </ListItem>
          <ListItem disablePadding>
            <ListItemButton>
              <ListItemIcon>
                <MuiPeopleAltOutlinedIcon />
              </ListItemIcon>
              <MuiListItemText primary="Candidates" />
            </ListItemButton>
          </ListItem>
          <ListItem disablePadding>
            <ListItemButton>
              <ListItemIcon>
                <MuiGavelIcon />
              </ListItemIcon>
              <MuiListItemText primary="Adverse Actions" />
            </ListItemButton>
          </ListItem>
          <ListItem disablePadding>
            <ListItemButton>
              <ListItemIcon>
                <MuiDescriptionOutlinedIcon />
              </ListItemIcon>
              <MuiListItemText primary="Logs" />
            </ListItemButton>
          </ListItem>
          <ListItem disablePadding>
            <ListItemButton>
              <ListItemIcon>
                <MuiInsertChartOutlinedIcon />
              </ListItemIcon>
              <MuiListItemText primary="Analytics" />
            </ListItemButton>
          </ListItem>
          <ListItem disablePadding>
            <ListItemButton>
              <ListItemIcon>
                <MuiManageAccountsOutlinedIcon />
              </ListItemIcon>
              <MuiListItemText primary="Account" />
            </ListItemButton>
          </ListItem>
          <ListItem disablePadding>
            <ListItemButton>
              <ListItemIcon>
                <MuiArticleOutlinedIcon />
              </ListItemIcon>
              <MuiListItemText primary="Screenings" />
            </ListItemButton>
          </ListItem>
        </List>
      </MuiBox>
    </MuiPaper>
  );
}

export default Sidebar;

